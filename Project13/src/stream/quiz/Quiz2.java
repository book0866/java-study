package stream.quiz;

import java.util.Arrays;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {

		// 다음과 같이 리스트를 생성하세요.
		// [file1.txt, file2.pdf, file3.txt, file4.img, file5.txt, file6.img]
		String[] strArr = { "file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img" };

		// 1) 파일 목록 중에서 txt 파일만 찾으세요.
		// 결과: file1.txt file3.txt file5.txt
		Stream<String> stream1 = Arrays.stream(strArr);
		stream1.filter(s -> s.endsWith("txt")).forEach(s -> System.out.println(s));

		System.out.println();
		// 2) 확장자별로 파일의 개수를 구하세요.
		// txt파일의 개수: 3
		// pdf파일의 개수: 1
		// img파일의 개수: 2
		Stream<String> stream2 = Arrays.stream(strArr);
		long txtCount = stream2.filter(s -> s.endsWith(".txt")).count();

		Stream<String> stream3 = Arrays.stream(strArr);
		long pdfCount = stream3.filter(s -> s.endsWith(".pdf")).count();

		Stream<String> stream4 = Arrays.stream(strArr);
		long imgCount = stream4.filter(s -> s.endsWith(".img")).count();

		System.out.println("txt파일의 개수: " + txtCount);
		System.out.println("pdf파일의 개수: " + pdfCount);
		System.out.println("img파일의 개수: " + imgCount);

		System.out.println();
		// 3) 파일의 확장자만 추출하여 출력하세요.
		// (hint! (.)점은 이스케이프로 (\\.)으로 표현해야한다 )
		// 결과: txt pdf img
		Stream<String> stream5 = Arrays.stream(strArr);

		stream5.map(s -> {
			return strArr[1];
		}).distinct().forEach(s -> System.out.print(s + " "));

	}

}
