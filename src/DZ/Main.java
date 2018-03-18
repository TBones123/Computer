package DZ;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<>();
        computerList.add(new Computer(
                "intel",
                1992,
                2000,
                5200,
                new Hdd("a-x5", TypHDD.SSD, 400, ManufacturerCountry.China),
                new Cpu(2, "asda", ManufacturerCountry.Korea)));
        computerList.add(new Computer(
                "Radik",
                1992,
                2000,
                5300,
                new Hdd("a-x66", TypHDD.HDD, 300, ManufacturerCountry.India),
                new Cpu(3, "asda", ManufacturerCountry.Korea)));
        computerList.add(new Computer(
                "intel",
                2011,
                1000,
                5500,
                new Hdd("a-x1", TypHDD.SSD, 650, ManufacturerCountry.Usa),
                new Cpu(1, "i7", ManufacturerCountry.India)));
        computerList.add(new Computer(
                "intel",
                2014,
                1000,
                5000,
                new Hdd("a-x1", TypHDD.SSD, 600, ManufacturerCountry.Usa),
                new Cpu(1, "i7", ManufacturerCountry.India)));
        computerList.add(new Computer(
                "intel",
                2012,
                1000,
                6000,
                new Hdd("a-x1", TypHDD.SSD, 700, ManufacturerCountry.Usa),
                new Cpu(1, "i7", ManufacturerCountry.India)));
        computerList.add(new Computer(
                "intel",
                2011,
                1000,
                5000,
                new Hdd("aaaa", TypHDD.HDD, 1000, ManufacturerCountry.China),
                new Cpu(2, "asda", ManufacturerCountry.China)));

//        computerList.forEach(System.out::println);
        Stream<Computer> computerStream = computerList.stream();
        List<Computer> collect = computerStream
                .filter(new Predicate<Computer>() {
                    @Override
                    public boolean test(Computer computer) {
                        return computer.getYearIssue()>2010;
                    }
                })
                .collect(Collectors.toList());
        System.out.println("1. Знайти всі комп'ютери які мають рік випуску більше ніж 2010");
        System.out.println(collect);
        Stream<Computer> computerStream1 = computerList.stream();
        List<Computer> collect1 = computerStream1
                .filter(computer -> computer.getYearIssue()>2010&computer
                        .hdd.manufacturerCountry.equals(ManufacturerCountry.China))
                .collect(Collectors.toList());
        System.out.println("2. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник Китай");
        System.out.println(collect1);
        Stream<Computer> computerStream2 = computerList.stream();
        List<Computer> collect2 = computerStream2
                .filter(computer -> computer.getYearIssue()>2010&!computer.hdd
                        .manufacturerCountry.equals(ManufacturerCountry.China))
                .collect(Collectors.toList());
        System.out.println("3. Знайти всі комп'ютери які мають рік випуску більше ніж 2010 та країну виробник не Китай");
        System.out.println(collect2);
        Stream<Computer> computerStream3 = computerList.stream();
        List<Computer> collect3 = computerStream3
                .filter(computer -> computer.hdd.getVolumeHardDisk()>500)
                .collect(Collectors.toList());
        System.out.println("4. Знайти всі комп'ютери які мають жорсткий диск більше 500гб");
        System.out.println(collect3);
        Stream<Computer> computerStream5 = computerList.stream();
        List<Computer> collect5 = computerStream5
                .filter(computer -> computer.hdd.typHDD.equals(TypHDD.SSD)&computer.hdd
                        .getVolumeHardDisk()>500&computer.cpu.getFrequency().equals("i7"))
                .collect(Collectors.toList());
        System.out.println("5. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7");
        System.out.println(collect5);
        Stream<Computer> computerStream6 = computerList.stream();
        List<Computer> collect6 = computerStream6
                .sorted((o1, o2) -> o2.getPrice()-o1.getPrice())
                .filter(computer -> computer.hdd.typHDD.equals(TypHDD.SSD)&computer.hdd
                        .getVolumeHardDisk()>500&computer.cpu.getFrequency().equals("i7"))
                .collect(Collectors.toList());
        System.out.println("6. Знайти всі комп'ютери які мають жорсткий ссд диск більше 500гб та процессор і7 посортувати за ціною");
        System.out.println(collect6);
    }
}
