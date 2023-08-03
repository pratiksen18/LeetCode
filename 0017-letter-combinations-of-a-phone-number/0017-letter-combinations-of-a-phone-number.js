/**
 * @param {string} digits
 * @return {string[]}
 */
 // Runtime 62 ms Beats 84.93%
const L = {'2':"abc",'3':"def",'4':"ghi",'5':"jkl",'6':"mno",'7':"pqrs",'8':"tuv",'9':"wxyz"}
var letterCombinations = function(digits) {
    let output = []
    if (!digits.length) return []
    const bfs = (pos, str) => {
        if (pos === digits.length) output.push(str)
        else {
            let letters = L[digits[pos]]
            for (let i = 0; i < letters.length; i++) bfs(pos + 1, str + letters[i])
        }
    }
    bfs(0,"")
    return output
};