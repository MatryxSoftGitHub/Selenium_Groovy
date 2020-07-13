package com.test.demo

def name = "Matryxsoft"
//println name.length()
//println name
//println name[2]
//println name[-2]
//println name.indexOf('y')
//println name [0..2]
//println name.substring(2)
//println name.subSequence(1,4)
def str = "This is a groovy class"
println str.split(" ")
println str-("groovy")
println str.replace("class", "session")
println str.toLowerCase()
println str.toUpperCase()
println str.toList()
println "groovy*3"
println "Abc".equals("Abc")
println "Abc".equalsIgnoreCase("abc")
def s1 = / a green sky/
def s2 = $/ a blue tree/$
println s1
println s2
def s3 = /a green sky $name/
def s4 = /a blue tree $name/
println s3
println s4
