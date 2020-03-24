package com.example.bgpsclient.domain;

import androidx.annotation.NonNull;

public interface JournalConverter<From, To> {
    @NonNull
    To convert(@NonNull From from);
}
