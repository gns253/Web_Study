package auth;

import java.util.Arrays;
import java.util.Random;

// 인증 메일을 통해 발송할 인증 코드 생성을 위한 클래스 정의
public class GenerateUserAuthenticationCode {
	private String authCode; // 인증 코드값을 저장할 변수
	
	// 인증 코드 생성에 사용될 코드 문자 집합을 배열로 생성
	// => 영문 대문자, 소문자, 숫자, 특수문자(!@#$) 사용
	char[] codeTable = {
		'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
		'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
		'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 
		'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 
		'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
		'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', '!', '@', '$'
	};
	
	// 생성자 정의 - 인증 코드의 길이(자릿수) 파라미터 선언
	public GenerateUserAuthenticationCode(int codeLength) {
		// Random 객체를 활용하여 배열 길이 범위 내의 값을 난수로 생성 후
		// 난수에 해당하는 배열 인덱스에 위치한 문자를 문자열 결합을 통해 인증 코드 생성
		// => 이 때, 난수로 생성한 문자열(인증코드)의 길이는 전달받은 파라미터 크기만큼 반복
		Random r = new Random();
		
		// 난수를 활용하여 가져온 코드 문자를 결합하여 저장할 객체 생성
		// => StringBuffer(또는 StringBuilder) 클래스는 버퍼를 활용하여 문자열을 직접 수정하므로
		//    String 클래스에 비해 문자열 수정에 유리함(메모리 낭비가 적고, 수정 속도가 빠름)
		StringBuffer buffer = new StringBuffer();
		
		// for 문을 사용하여 전달받은 코드 길이 만큼 반복
		for(int i = 1; i <= codeLength; i++) {
			// Random 객체의 nextInt(int bound) 메서드를 호출하여 난수 생성
			// 이 때, 난수의 범위를 테이블 크기로 한정하여 생성
			int rNum = r.nextInt(codeTable.length); // 0 ~ 테이블크기-1 까지 범위 정수형 난수 생성
			
			// 생성된 난수를 배열 인덱스로 활용하여 해당 인덱스의 문자를 StringBuffer 객체에 추가
			buffer.append(codeTable[rNum]);
		}
		
		// 생성된(결합된) 버퍼 내의 인증코드를 문자열로 변환하여 변수 authCode 에 저장
		authCode = buffer.toString();
	}

	// 생성된 인증코드를 리턴하는 Getter 메서드 정의
	public String getAuthCode() {
		return authCode;
	}
	
}













