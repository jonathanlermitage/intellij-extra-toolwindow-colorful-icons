// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.diagnostic.Logger;

import java.util.HashMap;

public class SafeMap<K, V> extends HashMap<K, V> {

    private final Logger LOG = Logger.getInstance(getClass().getName());

    @Override
    public V put(K key, V value) {
        if (this.containsKey(key)) {
            LOG.error("Duplicate key: " + key);
        }
        return super.put(key, value);
    }
}
