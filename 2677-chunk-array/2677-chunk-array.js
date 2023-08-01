/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array[]}
 */
var chunk = function(arr, size) {
    const output = [];
    for (let i = 0; i < arr.length; i += size) { output.push(arr.slice(i, i + size)); }
    return output;
};
