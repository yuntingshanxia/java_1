package javaProject;
//��̨�������
public class Admin {//����ѧ��

	public int setCreate(String name,int age,Student[] arr) {//���ѧ��
		Student stu = new  Student();
		stu.setName(name);
		stu.setAge(age);
		int i=this.getIndex(arr);
		if(i==99999) {
			System.out.println("�ѳ������ޣ��޷����");
		}else {
			arr[i]=stu;
			arr[i].setOn(i);
		}
		return i;
	}
	public int getIndex(Student[] arr) {//��ѯ�������Ƿ��д���
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==null) {
				return i;
			}	
		}
		return 99999;
	}

	public int getShuchu(Student[] stuArr,int a) {//���ѧ����Ϣ
		int j=0;
		if(a==-1) {
			System.out.println("\t���\t����\t����\tjava\tc#\thtml\tsql\t�ܷ�\tƽ����");
			for(int i =0; i<stuArr.length;i++) {
				if(stuArr[i]!=null) {
					System.out.println(stuArr[i]);
					j=i;
				}

			}
		
		}else if(stuArr[a]!=null) {
			System.out.println("\t���\t����\t����\tjava\tc#\thtml\tsql\t�ܷ�\tƽ����");	
			System.out.println(stuArr[a]);
			j=a;
		}else if(stuArr[a]==null) {
			System.out.println("��ѧ��������");
			j=-1;
		}
		return j;
	}
	public void setModifvthe(Student[] arr,int on,String name,int age) {//�޸�ѧ����Ϣ
		Student stu =new Student();
		if(arr[on]==null) {
			on=getIndex(arr);//������δ�����ı��
		}
		stu.setOn(on);stu.setName(name);stu.setAge(age);//���
		arr[on]=stu;
		if(arr[on]!=null) {//�ж��Ƿ���ӳɹ�
			System.out.println("�޸ĳɹ�");
			getShuchu(arr, on);//���
		}else {
			System.out.println("���ʧ��");
		}
	}
	
	public void setResult(Student[] arr,int on, int java, int c_shar,int html,int sql) {//�޸�ѧ���ɼ�
		Student stu = arr[on];
		
		if(arr[on]==null) {
			on=getIndex(arr);//������δ�����ı��
			if(on==99999) {
				System.out.println("��ѯ��ѧ�������������ޣ�����������");
				return;
			}
		}
		stu.setOn(on);stu.setJava(java);stu.setC_shar(c_shar);stu.setHtml(html);stu.setsql(sql);stu.setSum();stu.setAvg();
		arr[on]=stu;
		if(arr[on]!=null) {
			System.out.println("�޸ĳɹ�");
		}else {
			System.out.println("���ʧ��");
		}
		getShuchu(arr, on);//���
	}
	public void getchengjipaixu(Student[] arr,int leibie) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				arr[i].
			}
			
		}
		
		
	}
	
}