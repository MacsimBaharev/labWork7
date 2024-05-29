package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<Phone> phones = new ArrayList<>();
        phones.add(new Phone("89058827812", true));
        phones.add(new Phone("856532", false));
        clients.add(new Client(1, "Max", 19, true, phones));
        phones.clear();
        phones.add(new Phone("89358468321", true));
        clients.add(new Client(2, "Lena", 15, false, phones));
        phones.clear();
        phones.add(new Phone("564525", false));
        clients.add(new Client(3, "Alex", 23, true, phones));

        Stream<Client> clientStream = clients.stream();
        long count = clientStream.filter(w -> (w.getPhones().stream().anyMatch(p -> !p.isType()))).count();
        System.out.println(count + "\n");
        clientStream = clients.stream();
        clientStream.filter(w -> w.getAge() >= 18).peek(System.out::println).count();
        clientStream = clients.stream();
        boolean womenAge60 = clientStream.filter(w -> w.getAge() >= 60 && w.getPhones().stream().anyMatch(p -> !p.isType())).count() > 0;
        System.out.println("\n" + womenAge60 + "\n");
        clientStream = clients.stream();
        clientStream.sorted(Comparator.comparing(Client::getName)).forEach(System.out::println);
        System.out.println();
        clientStream = clients.stream();
        clientStream.sorted(Comparator.comparing(Client::getAge)).forEach(System.out::println);
    }
}