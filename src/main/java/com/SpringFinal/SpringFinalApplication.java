package com.SpringFinal;

import com.SpringFinal.Model.DistanceCount;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFinalApplication.class, args);

		System.out.println(DistanceCount.distance(23.77762291489889, 90.40569366959997,   23.74250850042582, 90.4307562297393,"K") + " kILOMETERS\n");
		//System.out.println(DistanceCount.distance(32.9697, -96.80322, 29.46786, -98.53506, "K") + " Kilometers\n");
		//System.out.println(DistanceCount.distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
	}

}
