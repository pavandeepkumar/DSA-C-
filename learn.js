// export const SumOfTwoNumber = ({ number1 = 0, number2 = 0 }) => number1 + number2;
// console.log("SumOfTwoNumber", SumOfTwoNumber({ number1: 1, number2: 5 }))
// export const MaxNumber = (...args) => Math.max(...args)
// console.log("MaxNumber", MaxNumber(3, 4, 6))
// export const isPalindrome = (val = '') => {
//     console.log("value", val)
//     console.log("value in string", val.toString())
//     const reverse = val.toString().split("").reverse().join("")
//     return reverse == val ? true : false
// }
// console.log(isPalindrome(121))
// export const reverseString = (val = '') => val.split("").reverse().join("")
// // console.log("reverseString", reverseString("pavandeep"))
// export const ReturnOnlyEvenNumber = (val = []) => val.filter((val) => val % 2 == 0)
// // console.log("ReturnOnlyEvenNumber", ReturnOnlyEvenNumber([1, 2, 3, 4, 5, 6]))

// // export const factorial = (val = 1) => {
// //     let num = Number(val)
// //     if (num === 1 || num === 2) return num
// //     else return num * factorial(val - 1)
// // }
// // // console.log(factorial(6))
// // export const isPrime = (val) => {
// //     if (val === 1) return false
// //     for (let index = 2; index <= Math.floor(Math.sqrt(val)); index++) {
// //         if (val % index === 0) return false
// //     }
// //     return true
// // }

// // const UniqueArrays = (array = []) => [...new Set(array)]
// // console.log(UniqueArrays([2, 3, 4, 4]))

// // const calculateAverage = (array = []) => array.reduce((acc, value) => (acc + value), 0) / array.length
// // console.log("calculating average", calculateAverage([1, 2, 3, 4, 5]))

// // const removeFalsyValues = (arr = []) => arr.filter(Boolean)
// // console.log("removeFalsyValues", removeFalsyValues([0, false, undefined, 3, 5, false]))

// // const findSecondLargestNumber = (arr = []) => arr.sort()[arr.length - 2]
// // console.log("findSecondLargest", findSecondLargestNumber([3, 6, 4, 5, 7]))

// // const separateOddEvenNumber = (arr = []) => [[...arr.filter(val => val % 2 == 0)], [...arr.filter(val => val % 2 !== 0)]]
// // console.log(separateOddEvenNumber([1,2,3,4,5,6,7,8]))


// console.log()
// const str=Number([9].join("").toString())+1
// console.log("str: " ,(Number(str)).toString().split("").map(Number))

// var plusOne = function (digits) {
//     console.log("digits: " ,(digits))
//     console.log("digits with join",digits.join(""))
//     console.log("digits with join and string ", digits.join("").toString())
//     console.log("digits with join and type check",(Number(digits.join("").toString())+1))
//     const str = Number(digits.join("").toString()) + 1
//     console.log("strring with join and string ",str)
//     return (Number(str)).toString().split("").map(Number)
// };

// console.log(plusOne([6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3]))



const TwoSum = (arr = [], target) => {
    for (let i = 0; i < arr.length; i++) {
        let result = arr[(arr.length - 1) - i];
        let sum = target - result;
        if (arr[i] == sum) {
            return [arr[(arr.length - 1) - i], i];
        }
    }
}

console.log(TwoSum([2, 7, 3, 4, 5], 6))