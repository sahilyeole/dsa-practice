export default function two_crystal_balls(breaks: boolean[]): number {

  let jumpLength = Math.floor(Math.sqrt(breaks.length))
  
  let i = 0
  for(; i<breaks.length; i+=jumpLength){
    if (breaks[i] === true){
      break
    } 
  }

  for (let j = i-jumpLength ; j<i ; j++){
    if (breaks[j] == true)
      return j
  }
 return -1
}
