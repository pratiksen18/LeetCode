/**
 * @param {Function} fn
 * @return {Array}
 */
Array.prototype.groupBy = function(fn) {
    return this.reduce((gr, i) => {
        const id = fn(i);
        if (!gr[id]) { gr[id] = []; }
        gr[id].push(i);
        return gr;
  ``}, {});
};

/**
 * [1,2,3].groupBy(String) // {"1":[1],"2":[2],"3":[3]}
 */