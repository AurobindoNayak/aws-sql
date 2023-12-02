package com.ants.springreactive.controller;

import com.ants.springreactive.vo.Address;
import com.ants.springreactive.vo.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class FluxTest {

    public Flux<String> nameFlux() {
        return Flux.fromIterable(List.of("Aru", "AAA", "Fangu"));
    }

    public Mono<String> getMonoName() {
        return Mono.just("Aru");
    }

    public Flux<String> nameToUpperCase() {
        return Flux.fromIterable(List.of("aru", "fangu")).map(x -> x.toUpperCase());
    }

    public Flux<String> imutaeableflux() {
        var result = Flux.fromIterable(List.of("aru", "fangu"));
        result.map(x -> x.toUpperCase());
        return result;
    }

    public Flux<Employee> getFlatMap() {
        Flux<Employee> employeeFlux = Flux.just(new Employee("Aru",Arrays.asList(new Address("Odisha"))));
        return employeeFlux.flatMap(x->employeeFlux);
    }

    public static void main(String[] args) {
        FluxTest ftb = new FluxTest();
        ftb.nameFlux().subscribe(name -> {
            System.out.println(name);
        });

        ftb.nameFlux().toStream().forEach(x -> {
            System.out.println(x);
        });

        ftb.getMonoName().subscribe(mono -> {
            System.out.println(mono);
        });

        System.out.println(ftb.getFlatMap());
       // ftb.getFlatMap().parallel();
    }

//    public Flux<Employee> getEmployeeList() {
////        List<Address> addressList = Arrays.asList(new Address("odisha"));
////        var empList = Arrays.asList(new Employee("Aru", addressList));
//        Flux<Employe>
//        return Flux.fromIterable(empList);
//    }

}
