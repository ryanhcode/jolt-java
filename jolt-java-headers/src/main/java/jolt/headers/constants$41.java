// Generated by jextract

package jolt.headers;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$41 {

    static final FunctionDescriptor JPC_TaperedCapsuleShapeSettings_SetBottomRadius$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_TaperedCapsuleShapeSettings_SetBottomRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_TaperedCapsuleShapeSettings_SetBottomRadius",
        constants$41.JPC_TaperedCapsuleShapeSettings_SetBottomRadius$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShapeSettings_Create$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CylinderShapeSettings_Create$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShapeSettings_Create",
        constants$41.JPC_CylinderShapeSettings_Create$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShapeSettings_GetConvexRadius$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CylinderShapeSettings_GetConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShapeSettings_GetConvexRadius",
        constants$41.JPC_CylinderShapeSettings_GetConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShapeSettings_SetConvexRadius$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CylinderShapeSettings_SetConvexRadius$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShapeSettings_SetConvexRadius",
        constants$41.JPC_CylinderShapeSettings_SetConvexRadius$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShapeSettings_GetHalfHeight$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle JPC_CylinderShapeSettings_GetHalfHeight$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShapeSettings_GetHalfHeight",
        constants$41.JPC_CylinderShapeSettings_GetHalfHeight$FUNC
    );
    static final FunctionDescriptor JPC_CylinderShapeSettings_SetHalfHeight$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle JPC_CylinderShapeSettings_SetHalfHeight$MH = RuntimeHelper.downcallHandle(
        "JPC_CylinderShapeSettings_SetHalfHeight",
        constants$41.JPC_CylinderShapeSettings_SetHalfHeight$FUNC
    );
}


