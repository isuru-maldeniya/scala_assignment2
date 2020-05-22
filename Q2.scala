object Q2 extends App{
    def attendies(tiPrice:Int)=120+(15-tiPrice)*20/5
    def cost(tiPrice:Int)=500+3*attendies(tiPrice)
    def rev(tiPrice:Int)=tiPrice*attendies(tiPrice)
    def profit(tiPrice:Int)=rev(tiPrice)-cost(tiPrice)
    println(profit(15));
    println(profit(10));
    println(profit(20));
    println(profit(25));
}