package com.example.rest_demo;

import org.springframework.data.annotation.Id;

record CashCard(@Id Long id, Double amount) { }
