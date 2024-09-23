function DuplicateFind({ array = [] }) {
    let j = 1
    for (let i = 0; i < array.length; i++) {
        if (array[i] !== array[j - 1]) {
            array[++j] = array[i]
        }
    }
    return j + 1
}


console.log(DuplicateFind({ array: [1, 1, 1, 1,  3, 3, 5, 5] }))