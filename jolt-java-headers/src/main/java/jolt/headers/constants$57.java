// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$57 {

    static final FunctionDescriptor JPC_OffsetCenterOfMassShapeSettings_SetOffset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_OffsetCenterOfMassShapeSettings_SetOffset$MH = RuntimeHelper.downcallHandle(
        "JPC_OffsetCenterOfMassShapeSettings_SetOffset",
        constants$57.JPC_OffsetCenterOfMassShapeSettings_SetOffset$FUNC
    );
    static final FunctionDescriptor JPC_Shape_AddRef$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_AddRef$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_AddRef",
        constants$57.JPC_Shape_AddRef$FUNC
    );
    static final FunctionDescriptor JPC_Shape_Release$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_Release$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_Release",
        constants$57.JPC_Shape_Release$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetRefCount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetRefCount$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetRefCount",
        constants$57.JPC_Shape_GetRefCount$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetType$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetType",
        constants$57.JPC_Shape_GetType$FUNC
    );
    static final FunctionDescriptor JPC_Shape_GetSubType$FUNC = FunctionDescriptor.of(Constants$root.C_CHAR$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_Shape_GetSubType$MH = RuntimeHelper.downcallHandle(
        "JPC_Shape_GetSubType",
        constants$57.JPC_Shape_GetSubType$FUNC
    );
}


