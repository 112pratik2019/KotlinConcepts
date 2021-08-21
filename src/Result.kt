sealed class Result<out T: Any>{
    data class Success<out T:Any>(val data:T):Result<T>()
    data class Failed(val msg:String):Result<Nothing>()
}
