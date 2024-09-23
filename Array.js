/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
const merge = (nums1, m, nums2, n) => {
    let firstArr = [];
    let secondArr = [];
    for (let i = 0; i < m; i++) {
        console.log("Running For Num1", i)
        firstArr.push(nums1[i])

    }
    for (let i = 0; i < n; i++) {
        console.log("Running For Num2", i)
        firstArr.push(nums2[i])
    }

    console.log("fist", firstArr)
    console.log("second", secondArr)

    let arraySort = firstArr.concat(secondArr)
    console.log("arraySort", arraySort)
    console.log("arraySort", arraySort.sort())
    return arraySort.sort()
};

// console.log(merge([1, 2, 3, 0, 0, 0], 3, [2, 4, 5], 3))


/**
 * @param {number[]} nums
 * @return {number}
 */
/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
    if (nums.length === 0) return 0;

    let count = 1; // Initialize the count with 1, because the first element is always unique

    for (let i = 1; i < nums.length; i++) {
        if (nums[i] !== nums[i - 1]) {
            nums[count] = nums[i]; // Replace the next position with the unique element
            count++; // Increment count for the unique element
        }
    }

    return count; // Return the length of the modified array with unique elements
};

let result = removeDuplicates([1, 1, 2]);
console.log(result); // Output: 2
