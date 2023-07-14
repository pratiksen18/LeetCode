/**
 * @param {Function} fn
 */
function memoize(fn) {
    const cacheObject = {};
    return function(...args) {
        const key = JSON.stringify(args);
        if (key in cacheObject) { return cacheObject[key]; }
        else {
            const output = fn(...args);
            cacheObject[key] = output;
            return output;
        }
    }
}


/** 
 * let callCount = 0;
 * const memoizedFn = memoize(function (a, b) {
 *	 callCount += 1;
 *   return a + b;
 * })
 * memoizedFn(2, 3) // 5
 * memoizedFn(2, 3) // 5
 * console.log(callCount) // 1 
 */