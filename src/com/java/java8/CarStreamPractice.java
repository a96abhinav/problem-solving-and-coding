package com.java.java8;

import java.util.*;
import java.util.stream.Collectors;

public class CarStreamPractice {

	public static void main(String[] args) {
		List<Car> cars = Car.getSampleCars();

		// 1. Cars price > 20 lakhs
		List<Car> p1 = cars.stream()
				.filter(c -> c.getPrice() > 2000000)
				.toList();

		// 2. Unique brands
		List<String> p2 = cars.stream()
				.map(Car::getBrand)
				.distinct()
				.toList();

		// 3. Count automatic cars
		long p3 = cars.stream()
				.filter(Car::isAutomatic)
				.count();

		// 4. Sort by price asc
		List<Car> p4 = cars.stream()
				.sorted(Comparator.comparing(Car::getPrice))
				.toList();

		// 5. Sort by year desc
		List<Car> p5 = cars.stream()
				.sorted(Comparator.comparing(Car::getYear).reversed())
				.toList();

		// 6. Most expensive car
		Car p6 = cars.stream()
				.max(Comparator.comparing(Car::getPrice))
				.orElse(null);

		// 7. Highest mileage car
		Car p7 = cars.stream()
				.max(Comparator.comparing(Car::getMileage))
				.orElse(null);

		// 8. Group by fuel
		Map<String, List<Car>> p8 = cars.stream()
				.collect(Collectors.groupingBy(Car::getFuelType));

		// 9. Group by brand
		Map<String, List<Car>> p9 = cars.stream()
				.collect(Collectors.groupingBy(Car::getBrand));

		// 10. Average price
		double p10 = cars.stream()
				.collect(Collectors.averagingDouble(Car::getPrice));

		// 11. List of models
		List<String> p11 = cars.stream()
				.map(Car::getModel)
				.toList();

		// 12. Total price sum
		double p12 = cars.stream()
				.mapToDouble(Car::getPrice)
				.sum();

		// 13. Count per fuel type
		Map<String, Long> p13 = cars.stream()
				.collect(Collectors.groupingBy(Car::getFuelType, Collectors.counting()));

		// 14. Cheapest car per brand
		Map<String, Optional<Car>> p14 = cars.stream()
				.collect(Collectors.groupingBy(Car::getBrand,
						Collectors.minBy(Comparator.comparing(Car::getPrice))));

		// 15. Most expensive per fuel type
		Map<String, Optional<Car>> p15 = cars.stream()
				.collect(Collectors.groupingBy(Car::getFuelType,
						Collectors.maxBy(Comparator.comparing(Car::getPrice))));

		// 16. Automatic vs Manual
		Map<Boolean, List<Car>> p16 = cars.stream()
				.collect(Collectors.partitioningBy(Car::isAutomatic));

		// 17. Multi-level grouping
		Map<String, Map<String, List<Car>>> p17 = cars.stream()
				.collect(Collectors.groupingBy(Car::getBrand,
						Collectors.groupingBy(Car::getFuelType)));

		// 18. Top 3 expensive cars
		List<Car> p18 = cars.stream()
				.sorted(Comparator.comparing(Car::getPrice).reversed())
				.limit(3)
				.toList();

		// 19. Map model->price
		Map<String, Double> p19 = cars.stream()
				.collect(Collectors.toMap(Car::getModel, Car::getPrice));

		// 20. Avg mileage per brand
		Map<String, Double> p20 = cars.stream()
				.collect(Collectors.groupingBy(Car::getBrand,
						Collectors.averagingInt(Car::getMileage)));

		// 21. Distinct colors
		List<String> p21 = cars.stream()
				.map(Car::getColor)
				.distinct()
				.toList();

		// 22. Second highest price
		Car p22 = cars.stream()
				.sorted(Comparator.comparing(Car::getPrice).reversed())
				.skip(1)
				.findFirst().orElse(null);

		// 23. Count per year
		Map<Integer, Long> p23 = cars.stream()
				.collect(Collectors.groupingBy(Car::getYear, Collectors.counting()));

		// 24. CSV of models
		String p24 = cars.stream()
				.map(Car::getModel)
				.collect(Collectors.joining(", "));

		// 25. Max price per year
		Map<Integer, Optional<Car>> p25 = cars.stream()
				.collect(Collectors.groupingBy(Car::getYear,
						Collectors.maxBy(Comparator.comparing(Car::getPrice))));

		// 26. Brand -> List of models
		Map<String, List<String>> p26 = cars.stream()
				.collect(Collectors.groupingBy(Car::getBrand,
						Collectors.mapping(Car::getModel, Collectors.toList())));

		// 27. Duplicate models
		Set<String> p27 = cars.stream()
				.collect(Collectors.groupingBy(Car::getModel, Collectors.counting()))
				.entrySet().stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.toSet());

		// 28. All cars newer than 2018
		boolean p28 = cars.stream()
				.allMatch(c -> c.getYear() > 2018);

		// 29. Any EV car
		boolean p29 = cars.stream()
				.anyMatch(c -> c.getFuelType().equals("EV"));

		// 30. Immutable list
		List<Car> p30 = cars.stream().toList();
	}
}