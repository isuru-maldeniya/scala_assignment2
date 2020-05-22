object Q1 extends App{
    def normalHoursPayment(hou:Int)=hou*150
    def otPayments(hou:Int)=hou*75
    def payments(hou1:Int,hou2:Int)=normalHoursPayment(hou1)+otPayments(hou2)
    def takeHomePayment(hou1:Int,hou2:Int)=payments(hou1,hou2)*90/100
    println(takeHomePayment(40,20));
}