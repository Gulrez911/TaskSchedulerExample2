package com.gul.test.master;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.hibernate.mapping.Array;

public class Player {

	String playerType;
	Integer rating;
	String city;

	public String getPlayerType() {
		return playerType;
	}

	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Player(String playerType, Integer rating, String city) {
		super();
		this.playerType = playerType;
		this.rating = rating;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Player [playerType=" + playerType + ", rating=" + rating + ", city=" + city + "]";
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//		Player[] parray = new Player[22];
		List<Player> pl = new ArrayList<Player>();
		for (int i = 0; i < 22; i++) {
			pl.add(new Player(sc.next(), sc.nextInt(), sc.next()));
		}

		System.out.println(pl);
		int bat = 0;
		int bowl = 0;
		int wick = 0;
		int allr = 0;
		for (int i = 0; i < 22; i++) {
			if (pl.get(i).getPlayerType().equals("Batsman")) {
				bat = bat + 1;
			}
			if (pl.get(i).getPlayerType().equals("Bowler")) {
				bowl = bowl + 1;
			}
			if (pl.get(i).getPlayerType().equals("WicketKeeper")) {
				wick = wick + 1;
			}
			if (pl.get(i).getPlayerType().equals("AllRounder")) {
				allr = allr + 1;
			}
		}
		System.out.println("bat: " + bat + ": bowl " + bowl + ": wick: " + wick + ": allr: " + allr);
		if (bat < 3 || bowl < 3 || wick < 1|| allr < 1) {
			System.out.println("Input is Not Valid");
		}
	}

}
