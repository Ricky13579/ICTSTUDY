package ch14;

import java.util.*;

public class _05_Main {
	public static void main(String[] args) {
		List<_05_RainBow> list = new ArrayList<_05_RainBow>();
		_05_RainBow red = new _05_RainBow(rainbow.빨강, 1);
		_05_RainBow orange = new _05_RainBow(rainbow.주황, 2);
		_05_RainBow yellow = new _05_RainBow(rainbow.노랑, 3);
		_05_RainBow green = new _05_RainBow(rainbow.초록, 4);
		_05_RainBow blue = new _05_RainBow(rainbow.파랑, 5);
		_05_RainBow navy = new _05_RainBow(rainbow.남색, 6);
		_05_RainBow purple = new _05_RainBow(rainbow.보라, 7);
		
		list.add(red);
		list.add(orange);
		list.add(yellow);
		list.add(green);
		list.add(blue);
		list.add(navy);
		list.add(purple);
		
		for(_05_RainBow c : list) {
			System.out.println(c.toString());
		}
		
	}
}
