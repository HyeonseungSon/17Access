import kr.co.softcampus.pkg1.InternalClass2
import kr.co.softcampus.pkg1.PublicClass2
import kr.co.softcampus.pkg1.TestClass2
import kr.co.softcampus.pkg2.PublicClass3
import kr.co.softcampus.pkg2.TestClass3

fun main() {
    // Private class 는 외부에서 사용할 수 없습니다.
    val obj1 = PrivateClass1()
    val obj2 = PublicClass1()
    val obj3 = InternalClass1()

    // Private class 는 외부에서 사용할 수 없습니다.
    val obj4 = PrivateClass2()
    val ojb5 = PublicClass2()
    val obj6 = InternalClass2()

    // Private class 는 외부에서 사용할 수 없습니다.
    val obj7 = PrivateClass3()
    val ojb8 = PublicClass3()
    // Internal Class 는 다른 모듈에서는 사용할 수 없습니다.
    val obj9 = InternalClass3()

    val t1 = TestClass1()
    // private 멤버는 사용할 수 없다.
    println("t1.private1 : ${t1.private1}")
    println("t1.public1 : ${t1.public1}")
    // protected 멤버는 상속관계가 아니므로 사용할 수 없습니다.
    println("t1.protected1 : ${t1.protected1}")
    println("t1.internal1 : ${t1.internal1}")

    val t2 = TestClass2()
    // private 멤버는 사용할 수 없다.
    println("t2.private2 : ${t2.private2}")
    println("t2.public2 : ${t2.public2}")
    // protected 멤버는 상속관계가 아니므로 사용할 수 없습니다.
    println("t2.protected2 : ${t2.protected2}")
    println("t2.internal2 : ${t2.internal2}")

    val t3 = TestClass3()
    // private 멤버는 사용할 수 없다.
    println("t3.private2 : ${t3.private3}")
    println("t3.public2 : ${t3.public3}")
    // protected Member 는 상속관계가 아니므로 사용할 수 없습니다.
    println("t3.protected2 : ${t3.protected3}")
    // Internal Member 는 다른 Module 에서는 사용할 수 없습니다.
    println("t3.internal2 : ${t3.internal3}")
}

// 동일 Package
class SubClass1 : TestClass1() {

    fun subMethod1() {
        // private 멤버 사용 불가
        println("private1 : $private1")
        println("public1 : $public1")
        // protected 멤버 : 상속 관계에서 사용가능합니다.
        println("protected1 : $protected1")
        println("internal1 : $internal1")
    }
}

// 다른 Package
class SubClass2 : TestClass2() {

    fun subMethod2() {
        // private 멤버는 사용할 수 없다.
        println("private2 : ${private2}")
        println("public2 : ${public2}")
        println("protected2 : ${protected2}")
        println("internal2 : ${internal2}")
    }
}

// 다른 Module
class SubClass3 : TestClass3() {

    fun subMethod3() {
        // Private Member : 해당 Class 의 외부에서는 절대 사용할 수 없습니다.
        println("private3 : ${private3}")
        println("public3 : ${public3}")
        // Protected Member : Module 이 다르더라도 상속관계에서는 사용이 가능합니다.
        println("protected3 : ${protected3}")
        // Internal Member 는 다른 Module 에서는 사용할 수 없습니다.
        println("internal3 : ${internal3}")
    }
}



