package com.java8;

import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) {
		Stream<Integer> dataStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
		dataStream.forEach( System.out::println);

	}

}
