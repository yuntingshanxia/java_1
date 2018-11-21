package javaProject;
//后台管理程序
public class Admin {//管理学生

	public int setCreate(String name,int age,Student[] arr) {//添加学生
		Student stu = new  Student();
		stu.setName(name);
		stu.setAge(age);
		int i=this.getIndex(arr);
		if(i==99999) {
			System.out.println("已超过上限，无法添加");
		}else {
			arr[i]=stu;
			arr[i].setOn(i);
		}
		return i;
	}
	public int getIndex(Student[] arr) {//查询类数组是否有创建
		for(int i=0;i<arr.length;i++ ) {
			if(arr[i]==null) {
				return i;
			}	
		}
		return 99999;
	}

	public int getShuchu(Student[] stuArr,int a) {//输出学生信息
		int j=0;
		if(a==-1) {
			System.out.println("\t编号\t姓名\t年龄\tjava\tc#\thtml\tsql\t总分\t平均分");
			for(int i =0; i<stuArr.length;i++) {
				if(stuArr[i]!=null) {
					System.out.println(stuArr[i]);
					j=i;
				}

			}
		
		}else if(stuArr[a]!=null) {
			System.out.println("\t编号\t姓名\t年龄\tjava\tc#\thtml\tsql\t总分\t平均分");	
			System.out.println(stuArr[a]);
			j=a;
		}else if(stuArr[a]==null) {
			System.out.println("该学生不存在");
			j=-1;
		}
		return j;
	}
	public void setModifvthe(Student[] arr,int on,String name,int age) {//修改学生信息
		Student stu =new Student();
		if(arr[on]==null) {
			on=getIndex(arr);//返回尚未建立的编号
		}
		stu.setOn(on);stu.setName(name);stu.setAge(age);//添加
		arr[on]=stu;
		if(arr[on]!=null) {//判断是否添加成功
			System.out.println("修改成功");
			getShuchu(arr, on);//输出
		}else {
			System.out.println("请改失败");
		}
	}
	
	public void setResult(Student[] arr,int on, int java, int c_shar,int html,int sql) {//修改学生成绩
		Student stu = arr[on];
		
		if(arr[on]==null) {
			on=getIndex(arr);//返回尚未建立的编号
			if(on==99999) {
				System.out.println("查询的学生超出人数上限，请重新设置");
				return;
			}
		}
		stu.setOn(on);stu.setJava(java);stu.setC_shar(c_shar);stu.setHtml(html);stu.setsql(sql);stu.setSum();stu.setAvg();
		arr[on]=stu;
		if(arr[on]!=null) {
			System.out.println("修改成功");
		}else {
			System.out.println("请改失败");
		}
		getShuchu(arr, on);//输出
	}
	public void getchengjipaixu(Student[] arr,int leibie) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=null) {
				arr[i].
			}
			
		}
		
		
	}
	
}