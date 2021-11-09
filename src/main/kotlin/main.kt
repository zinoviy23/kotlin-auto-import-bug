import reactor.core.publisher.Mono

//import reactor.kotlin.core.util.function.component1
//import reactor.kotlin.core.util.function.component2

fun main() {
    Mono.fromCallable { 1 }.zipWith(Mono.fromCallable { 2 })
        .flatMap { (a, b) ->
            Mono.fromCallable { a + b }
        }
        .subscribe()
}