/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
    let output = init;
    for (let i = 0; i < nums.length; i++) output = fn(output, nums[i]);
    return output;
};