// Generated by jextract

package jolt.headers_f;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$74 {

    static final FunctionDescriptor JPC_Body_SetIsSensor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle JPC_Body_SetIsSensor$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetIsSensor",
        constants$74.JPC_Body_SetIsSensor$FUNC
    );
    static final FunctionDescriptor JPC_Body_IsSensor$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_IsSensor$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_IsSensor",
        constants$74.JPC_Body_IsSensor$FUNC
    );
    static final FunctionDescriptor JPC_Body_SetUseManifoldReduction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_BOOL$LAYOUT
    );
    static final MethodHandle JPC_Body_SetUseManifoldReduction$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_SetUseManifoldReduction",
        constants$74.JPC_Body_SetUseManifoldReduction$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetUseManifoldReduction$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetUseManifoldReduction$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetUseManifoldReduction",
        constants$74.JPC_Body_GetUseManifoldReduction$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetUseManifoldReductionWithBody$FUNC = FunctionDescriptor.of(Constants$root.C_BOOL$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetUseManifoldReductionWithBody$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetUseManifoldReductionWithBody",
        constants$74.JPC_Body_GetUseManifoldReductionWithBody$FUNC
    );
    static final FunctionDescriptor JPC_Body_GetMotionType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Body_GetMotionType$MH = RuntimeHelper.downcallHandle(
        "JPC_Body_GetMotionType",
        constants$74.JPC_Body_GetMotionType$FUNC
    );
}


