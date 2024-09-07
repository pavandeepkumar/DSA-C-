export const SumOfTwoNumber = ({ number1 = 0, number2 = 0 }) => number1 + number2;
console.log("SumOfTwoNumber", SumOfTwoNumber({ number1: 1, number2: 5 }))
export const MaxNumber = (...args) => Math.max(...args)
console.log("MaxNumber", MaxNumber(3, 4, 6))
export const isPalindrome = (val = '') => {
    const reverse = val.split("").reverse().join("")
    return reverse == val ? true : false
}
// console.log(isPalindrome("121"))
export const reverseString = (val = '') => val.split("").reverse().join("")
// console.log("reverseString", reverseString("pavandeep"))
export const ReturnOnlyEvenNumber = (val = []) => val.filter((val) => val % 2 == 0)
// console.log("ReturnOnlyEvenNumber", ReturnOnlyEvenNumber([1, 2, 3, 4, 5, 6]))

export const factorial = (val = 1) => {
    let num = Number(val)
    if (num === 1 || num === 2) return num
    else return num * factorial(val - 1)
}
// console.log(factorial(6))
export const isPrime = (val) => {
    if (val === 1) return false
    for (let index = 2; index <= Math.floor(Math.sqrt(val)); index++) {
        if (val % index === 0) return false
    }
    return true
}

const UniqueArrays =(array=[])=>[...new Set(array)]
console.log(UniqueArrays([2,3,4,4]))
    
