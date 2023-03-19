export default function bs_list(haystack: number[], needle: number): boolean {

  let low:number = 0;
  let high:number = haystack.length -1

  while (low<=high){
    let mid = Math.floor(low + (high-low)/2)
    if (haystack[mid] == needle) {
      return true
    }
    if (needle < haystack[mid]){
      high = mid -1;
    }
    else low = mid + 1
  }

  return false
}
