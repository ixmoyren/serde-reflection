// Copyright (c) Facebook, Inc. and its affiliates
// SPDX-License-Identifier: MIT OR Apache-2.0

package com.novi.serde;

import java.util.Objects;

public record Tuple6<T0, T1, T2, T3, T4, T5>(T0 field0, T1 field1, T2 field2, T3 field3, T4 field4, T5 field5) {
    public Tuple6 {
        Objects.requireNonNull(field0, "field0 must not be null");
        Objects.requireNonNull(field1, "field1 must not be null");
        Objects.requireNonNull(field2, "field2 must not be null");
        Objects.requireNonNull(field3, "field3 must not be null");
        Objects.requireNonNull(field4, "field4 must not be null");
        Objects.requireNonNull(field5, "field5 must not be null");
    }
}
