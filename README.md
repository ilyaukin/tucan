Tucan programming language
==========================

Tucan (stands for "Turing can") is an 
esoteric programming language that is 
executing over JVM.

## Motivation

First time I saw this language in a dream.
It had syntax `{"number"}` where number is 
the number of Turing machine being execute.

But after some thought I decided to made it
subset of json so it became 
`{"descriptionNumber": "number"}` .

The goal is to study to generate byte-code 
and gather some knowledge in computation 
theory.

## Syntax

Tucan 1.0 is the subset of json, the json 
must consist of one node which key must be
"descriptionNumber", value must be string
representing decimal integer which is 
[description number](https://en.wikipedia.org/wiki/Description_number).

