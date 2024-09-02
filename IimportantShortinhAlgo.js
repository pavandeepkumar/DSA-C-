const SelectionSort = (array) => {
    for (let i = 0; i < array.length - 1; i++) {
        let minIndex = i
        for (let j = i + 1; j < array.length; j++) {
            if (array[j] < array[minIndex]) {
                minIndex = j
            }
        }
        let temp = array[minIndex]
        array[minIndex] = array[i]
        array[i] = temp
    }
}
const arr=[3,2,4,5,6,7,8,9]
console.log("unsorted array: ", arr)
SelectionSort(arr)

console.log("sorted array",arr)

let names="Pavandeep Kumar"

const numbers = [1, 2, 3, 4, 5];
const result = numbers
console.log(result); // 14