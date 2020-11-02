public class graduate implements StudentInterface,TeacherInterface{
	public String name,sex;
	public int age,fee,pay;
	public graduate(String name,String sex,int age,int fee,int pay){
		this.name=name;
		this.sex=sex;
		this.age=age;
		this.fee=fee;
		this.pay=pay;
		}public graduate(){
		this("","",0,0,0);
		}public void setFee(int a){
			this.fee=a;
			}public int getFee(){
			return this.fee;}
		public void setPay(int a){
			this.pay=a;
			}public int getPay(){
				return this.pay;
				}public String toString(){
					return "姓名："+this.name+"性别："+this.sex+"年龄："+this.age+"学费："+this.fee+"工资："+this.pay;

}
}
