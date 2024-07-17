package com.alura.literalura.service;

public interface IJsonConverter {
  <T> T getData(String json, Class<T> classe);
}
