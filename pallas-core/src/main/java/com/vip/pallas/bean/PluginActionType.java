/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.bean;

public enum PluginActionType {

	DOWNLOAD("DOWNLOAD", 1),
	ENABLE("ENABLE", 2),
	REMOVE("REMOVE", 3),
	RESTART("RESTART", 4),
	DOWN_AND_ENABLE("DOWN_AND_ENABLE", 5);

	private String desc;
	private int value;

	PluginActionType(String desc, int value) {
		this.desc = desc;
		this.value = value;
	}

	public String getDesc() {
		return this.desc;
	}

	public int getValue() {
		return value;
	}
}