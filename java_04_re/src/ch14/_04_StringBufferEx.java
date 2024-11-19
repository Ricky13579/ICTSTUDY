package ch14;

public class _04_StringBufferEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("안녕하세요~ ");
		sb.append("감사해요~ ");
		sb.append("잘 있어요~ ");
		sb.append("다시 만나요~");
		System.out.println(sb);
		
		sb.insert(7, "또 만나요~ ");
		System.out.println(sb);
		
		System.out.println(sb.substring(7));
		System.out.println(sb.substring(7, 12));
	}
}
