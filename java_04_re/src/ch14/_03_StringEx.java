package ch14;

public class _03_StringEx {
	public static void main(String[] args) {
		
		String spider1 = "스파이더맨";
		
		System.out.println("amazing의 길이 : "+spider1.length());
		
		String spider2 = spider1.concat(" 홈커밍");
		System.out.println("spider2 : " + spider2);
		
		String spider3 = spider2.replace("홈커밍", "노 웨이 홈");
		System.out.println("spider3 : " + spider3);
		
		String spider4 = spider3.substring(0, 5);
		System.out.println("spider4 : " + spider4);
		
		String spider5 = "Spider man";
		spider5 = spider5.toUpperCase();
		System.out.println("spider5 : " + spider5);
		
		String spider6 = spider5.toLowerCase();
		System.out.println("spider6 : " + spider6);
		
		String pokemons = "피카츄 라이츄 파이리 꼬부기 버터플 야도란 피존투 또가스";
		String[] pokemon = pokemons.split(" ");
		for(String i : pokemon) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		String trimmer = "I love you!!";
		System.out.println(trimmer.trim());
	}
}
