/*
 * Copyright 2023 Ant Group Co., Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.secretflow.secretpad.common.errorcode;

/**
 * VoteErrorCode.
 *
 * @author cml
 * @date 2023/09/20
 */
public enum VoteErrorCode implements ErrorCode {
    VOTE_NOT_EXISTS(202012201),

    VOTE_CHECK_FAILED(202012202),

    VOTE_SIGNATURE_SYNCHRONIZING(202012203);
    private final int code;

    VoteErrorCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessageKey() {
        return "vote." + this.name();
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
