const BubbleSort = (array) => {
    if (array.length == 0) return
    if (array.length == 1) return array
    for (let i = 0; i < array.length - 1; i++) {
        let swap=false
        for (let j = 0; j < array.length - i; j++) {
            if (array[j] > array[j + 1]) {
                let temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swap=true;
            }
        }
        if (!swap) {
              return array
        }
    }
    return array
}

let array=[1,3,5]
console.log("Before shored array", array)
BubbleSort(array)
console.log("After shored array", array)
