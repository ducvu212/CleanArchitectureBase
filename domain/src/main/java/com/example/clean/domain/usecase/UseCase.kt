package com.example.clean.domain.usecase

/**
 * If Y want create something from base
 * Please code in here
 * UseCase<Type>
 */
abstract class UseCase<in Params, out T> where T : Any {

    abstract fun createObservable(params: Params? = null): T

    abstract fun onCleared()

}