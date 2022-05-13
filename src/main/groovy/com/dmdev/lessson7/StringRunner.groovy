package com.dmdev.lessson7

/**
 * " "
 * ' '
 * """ """
 * ''' '''
 * / /
 * $/ /$
 */
def value0 = "Ivan \"bububu\" but 'aga'"
def name = "Ivan"
def value = 'Hello "Hi"! but \'only tak\' '

def stringValue = "Hello $name"
println stringValue



def str = 'old'
def interpolated = "I am the ${str} value"
assert interpolated == 'I am the old value'
str = 'new'
assert interpolated == 'I am the old value'

def value2 = """
SELECT FROM *
table 
WHERE name = ${getWithPrefix(name)}
"""
println(value2)

def getWithPrefix(String name) {
    "prefix - " + name // return для последней строки
}

def value5 = /Hello world  $name/
println value5

def value6  = $/Helo world $name /$
println value6
println name[0]
println name[1]
println name[-1]
println name * 3
println name - "Iv"
println name + "an"

