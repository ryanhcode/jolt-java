// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor JPC_BodyID_GetSequenceNumber$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyID_GetSequenceNumber$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyID_GetSequenceNumber",
        constants$57.JPC_BodyID_GetSequenceNumber$FUNC
    );
    static final FunctionDescriptor JPC_BodyID_IsInvalid$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle JPC_BodyID_IsInvalid$MH = RuntimeHelper.downcallHandle(
        "JPC_BodyID_IsInvalid",
        constants$57.JPC_BodyID_IsInvalid$FUNC
    );
    static final FunctionDescriptor JPJ_GetFeatures$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle JPJ_GetFeatures$MH = RuntimeHelper.downcallHandleVariadic(
        "JPJ_GetFeatures",
        constants$57.JPJ_GetFeatures$FUNC
    );
    static final MemoryAddress NULL$ADDR = MemoryAddress.ofLong(0L);
}


