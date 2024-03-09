package com.sony;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tariff {

    static {
        System.out.println("from static");
    }
    {
        System.out.println("from instance");
    }
    private String name;
    private int price;
    private List<String> feature;
    private String region;


    public static void main(String[] args) {
        System.out.println("Hello world");
        Tariff t1 = new Tariff("unlimited", 100, Arrays.asList("sms"), "India");
        Tariff t2 = new Tariff("limited", 200, Arrays.asList("sms"), "Nepal");
        Tariff t3 = new Tariff("unlimited", 100, Arrays.asList("sms"), "India");
        Tariff t5 = new Tariff("unlimited", 50, Arrays.asList("sms"), "India");
        Tariff t4 = new Tariff("limited", 200, Arrays.asList("sms"), "Nepal");

        List<Tariff> s = new ArrayList<>();

        s.add(t1);
        s.add(t2);
        s.add(t3);
        s.add(t4);
        s.add(t5);
        //System.out.println(s);

        List<Tariff> s1 = s.stream().sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice())).collect(Collectors.toList());
        System.out.println(s1);

        List<Tariff> s2 = s.stream().sorted(Comparator.comparingInt(Tariff::getPrice)).collect(Collectors.toList());
        System.out.println("tariff is" + s2);

        Map<String, Double> sumByRegion = s1.stream().collect(Collectors.groupingBy(x -> x.getRegion(), Collectors.summingDouble(y -> y.getPrice())));
        System.out.println(sumByRegion);

        Map<String, Double> sumByRegion1 = s1.stream().collect(Collectors.groupingBy(x->x.getRegion(),Collectors.summingDouble(x->x.getPrice())));
        System.out.println(sumByRegion1);

    }

}
