/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    var output = [];
    for (var i = 0; i < arr.length; i++) if (fn(arr[i], i)) output.push(arr[i]);
    return output;
};