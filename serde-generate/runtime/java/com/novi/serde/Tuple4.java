// Copyright (c) Facebook, Inc. and its affiliates
// SPDX-License-Identifier: MIT OR Apache-2.0

package com.novi.serde;

import java.util.Objects;

public record Tuple4<T0, T1, T2, T3>(T0 field0, T1 field1, T2 field2, T3 field3) {
    public Tuple4 {
        Objects.requireNonNull(field0, "field0 must not be null");
        Objects.requireNonNull(field1, "field1 must not be null");
        Objects.requireNonNull(field2, "field2 must not be null");
        Objects.requireNonNull(field3, "field3 must not be null");
    }
}
