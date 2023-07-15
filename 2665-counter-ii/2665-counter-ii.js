/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    let curVal = init;
    return {
        increment() { return ++curVal; },
        decrement() { return --curVal; },
        reset() { curVal = init; return curVal; }
    };
}

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */