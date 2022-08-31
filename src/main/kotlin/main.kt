import java.util.*

val commissionMin = 3500.0
val commissionPersent = 0.0075
fun main() {
    fun transfer(money: Double) = Math.round(money) / 100.0
    val scanner = Scanner(System.`in`)
    print("Сумма перевода:\n" + "Рубли :\n")
    val imput1 = scanner.nextInt()
    print("Копейки :\n")
    val imput2 = scanner.nextInt()
    val result = imput1 * 100 + imput2
    var transferMoney = 0.0
    val commission = result * commissionPersent
    if (commission > commissionMin) transferMoney = result + commission else transferMoney = result + commissionMin
    print("Комиссия: " + transfer(transferMoney - result) + " Рублей \n" + "Сумма перевода : " + transfer(transferMoney) + " Рублей, копеек")

}