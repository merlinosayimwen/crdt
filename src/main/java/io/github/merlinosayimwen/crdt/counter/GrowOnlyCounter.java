// Copyright 2019 Merlin Osayimwen. All rights reserved.
// Use of this source code is governed by a MIT-style license that can be
// found in the LICENSE file.

package io.github.merlinosayimwen.crdt.counter;

import io.github.merlinosayimwen.crdt.Mergeable;

import java.util.Map;

/**
 * @param <K> Type of the id that identifies a node.
 */
public class GrowOnlyCounter<K> implements ReplicatedCounter, Mergeable<GrowOnlyCounter<K>> {
  private Map<K, Long> entries;

  @Override
  public long value() {
    return 0;
  }

  @Override
  public GrowOnlyCounter<K> merge(GrowOnlyCounter<K> other) {
    return null;
  }
}
