//자바의 문자 자료형인 char에 대해 알아보자
class CharTest{
	//main메서드는 java.exe가 호출될때 찾아나서는 실행부 메서드이다.
	public static void main(String[] args){
		//int x=3;
		//char c='A';
		//System.out.println(c);
		int k=7;
		byte b=5;
		//k=b;

		//손실을 감당하고서라도 자료형의 변환을 강제하는 현상을 가리켜 강제형변환이라 한다.
		//특히 큰 자료형에서 작은 자료형으로의 형변환의 경우 개발자는 작은 자료형으로의
		//형변환을 명시하는 cast연산자를 적용해야 한다. (강제형변환 캐스트 연산자)
		
		//b=(byte)k;
		short s=17;
		byte m=6;

		//아래의 코드의 경우, 모든 연산자 뿐 아니라 = 연산자도 피연산자의 자료형이 동일할때만 
		//동작될 수 있다. 따라서 아래의 연산에서 둘중 하나를 형변환하여 연산을 수행할 수 밖에
		//없는데, 이때 기준은 데이터의 손실이 발생하지 않아야 하므로, 작은 자료형을 큰 자료형에 
		//맞추어 자동형변환이 발생한다. 이러한 현상을 자동형변환이라고 하며 자동형변환은
		//손실이 발생하지 않기 때문에 개발자가 casting처리를 할 필요도 없으며, 언어차원에서
		//자동으로 처리된다.
		//s=m;

		//boolean y=true;//1,0
		//int z=5;
		//z=y;
		//long p=76;
		//short u=34;
		//p=u;
		//결론 자바의 3가지 자료형 중에서 숫자형끼리는 사실 용량만 다를 뿐 같은 자료형이다.

		//결론: java 언어뿐만 아니라, 사실상 모든 프로그래밍 언어에서 문자란 존재하지 않는다.
		//결국 모두 숫자였다.
		//주의) char형이 비록 숫자형이긴 해도, 주 사용 목적은 아스키, 유니코드와 같은 문자 체계의
		//음수아닌 숫자만을 담기 위한 목적의 자료형이므로 char형으로 수치연산에 사용하지는 말자.
		//아스키코드가 확장된 것이 유니코드다.
		char r='V';
		char n=97;

		

	}
}
/*바자의 3가지 자료형 중 비슷한 자료형간에는 서로 형변환이 가능함
문자
숫자
논리값
논리값만 배척 문자 숫자는 친함

자동형변환-암시적으로 즉 자동으로 형변환(작-->큰)
강제형변환- 개발자가 cast연산자로 명시(큰-->작)
*/
