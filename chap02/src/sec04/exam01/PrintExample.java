package sec04.exam01;

public class PrintExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("��ǰ�� ����:%d��\n", value);    //123��(�ٹٲ�)
		System.out.printf("��ǰ�� ����:%6d��\n", value);   //___123��(�ٹٲ�)
		System.out.printf("��ǰ�� ����:%-6d��\n", value);  //123___��(�ٹٲ�)
		System.out.printf("��ǰ�� ����:%06d��\n", value);  //000123��(�ٹٲ�)
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("�������� %d�� ���� ����:%10.2f\n", 10, area);
		//�������� 10�� ���� ����:______3.14(�� �ٲ�)
		
		String name = "ȫ�浿";
		String job = "����";
		System.out.printf("%6d: %-10s: %10s\n", 1, name, job);
		//_____1: ȫ�浿________: ����________(�� �ٲ�)

	}

}
